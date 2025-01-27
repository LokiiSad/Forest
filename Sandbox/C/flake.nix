{
  description = "A Nix-flake-based C/C++ development environment";

  inputs.nixpkgs.url = "https://flakehub.com/f/NixOS/nixpkgs/0.1.*.tar.gz";

  outputs = { self, nixpkgs }:
    let
      supportedSystems = [ "x86_64-linux" "aarch64-linux" "x86_64-darwin" "aarch64-darwin" ];
      forEachSupportedSystem = f: nixpkgs.lib.genAttrs supportedSystems (system: f {
        pkgs = import nixpkgs { inherit system; };
      });
    in
    {
      devShells = forEachSupportedSystem ({ pkgs }: {
        default = pkgs.mkShell.override
          {
            # Override stdenv in order to change compiler:
            stdenv = pkgs.clangStdenv;
          }
          { # Use nix develop or direnv allow
            packages = with pkgs; [
              clang-tools #clang compiler
              libgcc
              gdb         #debugger -> gdb ./outputfile
              cmake       #compiler 
              codespell   # Spell check -> codespell
              conan       # C package manager
              cppcheck    # Memory leak checker
              doxygen     # Source code documentation generator tool
              doxygen_gui #
              gtest       # Google's framework for writing C++ tests
              lcov        # tool to manipulate and display information about what part of a program are actually executed
              vcpkg       # C++ library manager
              vcpkg-tool
            ] ++ (if system == "aarch64-darwin" then [ ] else [ gdb ]);
          };
      });
    };
}


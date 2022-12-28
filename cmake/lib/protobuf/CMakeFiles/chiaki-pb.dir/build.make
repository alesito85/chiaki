# CMAKE generated file: DO NOT EDIT!
# Generated by "Unix Makefiles" Generator, CMake Version 3.22

# Delete rule output on recipe failure.
.DELETE_ON_ERROR:

#=============================================================================
# Special targets provided by cmake.

# Disable implicit rules so canonical targets will work.
.SUFFIXES:

# Disable VCS-based implicit rules.
% : %,v

# Disable VCS-based implicit rules.
% : RCS/%

# Disable VCS-based implicit rules.
% : RCS/%,v

# Disable VCS-based implicit rules.
% : SCCS/s.%

# Disable VCS-based implicit rules.
% : s.%

.SUFFIXES: .hpux_make_needs_suffix_list

# Command-line flag to silence nested $(MAKE).
$(VERBOSE)MAKESILENT = -s

#Suppress display of executed commands.
$(VERBOSE).SILENT:

# A target that is always out of date.
cmake_force:
.PHONY : cmake_force

#=============================================================================
# Set environment variables for the build.

# The shell in which to execute make rules.
SHELL = /bin/sh

# The CMake executable.
CMAKE_COMMAND = /usr/bin/cmake

# The command to remove a file.
RM = /usr/bin/cmake -E rm -f

# Escaping for special characters.
EQUALS = =

# The top-level source directory on which CMake was run.
CMAKE_SOURCE_DIR = /home/ales/git/chiaki

# The top-level build directory on which CMake was run.
CMAKE_BINARY_DIR = /home/ales/git/chiaki/cmake

# Utility rule file for chiaki-pb.

# Include any custom commands dependencies for this target.
include lib/protobuf/CMakeFiles/chiaki-pb.dir/compiler_depend.make

# Include the progress variables for this target.
include lib/protobuf/CMakeFiles/chiaki-pb.dir/progress.make

lib/protobuf/CMakeFiles/chiaki-pb: lib/protobuf/takion.pb.c
lib/protobuf/CMakeFiles/chiaki-pb: lib/protobuf/takion.pb.h

lib/protobuf/takion.pb.c: lib/protobuf/takion.pb
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --blue --bold --progress-dir=/home/ales/git/chiaki/cmake/CMakeFiles --progress-num=$(CMAKE_PROGRESS_1) "Generating takion.pb.c, takion.pb.h"
	cd /home/ales/git/chiaki/cmake/lib/protobuf && /usr/bin/cmake -E env PATH=/usr/bin:/usr/local/sbin:/usr/local/bin:/usr/sbin:/usr/bin:/sbin:/bin:/usr/games:/usr/local/games:/snap/bin:/snap/bin /usr/bin/python3 /home/ales/git/chiaki/third-party/nanopb/generator/nanopb_generator.py /home/ales/git/chiaki/cmake/lib/protobuf/takion.pb

lib/protobuf/takion.pb.h: lib/protobuf/takion.pb.c
	@$(CMAKE_COMMAND) -E touch_nocreate lib/protobuf/takion.pb.h

lib/protobuf/takion.pb: ../lib/protobuf/takion.proto
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --blue --bold --progress-dir=/home/ales/git/chiaki/cmake/CMakeFiles --progress-num=$(CMAKE_PROGRESS_2) "Generating takion.pb"
	cd /home/ales/git/chiaki/cmake/lib/protobuf && /usr/bin/protoc -o/home/ales/git/chiaki/cmake/lib/protobuf/takion.pb /home/ales/git/chiaki/lib/protobuf/takion.proto -I/home/ales/git/chiaki/lib/protobuf

chiaki-pb: lib/protobuf/CMakeFiles/chiaki-pb
chiaki-pb: lib/protobuf/takion.pb
chiaki-pb: lib/protobuf/takion.pb.c
chiaki-pb: lib/protobuf/takion.pb.h
chiaki-pb: lib/protobuf/CMakeFiles/chiaki-pb.dir/build.make
.PHONY : chiaki-pb

# Rule to build all files generated by this target.
lib/protobuf/CMakeFiles/chiaki-pb.dir/build: chiaki-pb
.PHONY : lib/protobuf/CMakeFiles/chiaki-pb.dir/build

lib/protobuf/CMakeFiles/chiaki-pb.dir/clean:
	cd /home/ales/git/chiaki/cmake/lib/protobuf && $(CMAKE_COMMAND) -P CMakeFiles/chiaki-pb.dir/cmake_clean.cmake
.PHONY : lib/protobuf/CMakeFiles/chiaki-pb.dir/clean

lib/protobuf/CMakeFiles/chiaki-pb.dir/depend:
	cd /home/ales/git/chiaki/cmake && $(CMAKE_COMMAND) -E cmake_depends "Unix Makefiles" /home/ales/git/chiaki /home/ales/git/chiaki/lib/protobuf /home/ales/git/chiaki/cmake /home/ales/git/chiaki/cmake/lib/protobuf /home/ales/git/chiaki/cmake/lib/protobuf/CMakeFiles/chiaki-pb.dir/DependInfo.cmake --color=$(COLOR)
.PHONY : lib/protobuf/CMakeFiles/chiaki-pb.dir/depend


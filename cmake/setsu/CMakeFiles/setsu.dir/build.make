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

# Include any dependencies generated for this target.
include setsu/CMakeFiles/setsu.dir/depend.make
# Include any dependencies generated by the compiler for this target.
include setsu/CMakeFiles/setsu.dir/compiler_depend.make

# Include the progress variables for this target.
include setsu/CMakeFiles/setsu.dir/progress.make

# Include the compile flags for this target's objects.
include setsu/CMakeFiles/setsu.dir/flags.make

setsu/CMakeFiles/setsu.dir/src/setsu.c.o: setsu/CMakeFiles/setsu.dir/flags.make
setsu/CMakeFiles/setsu.dir/src/setsu.c.o: ../setsu/src/setsu.c
setsu/CMakeFiles/setsu.dir/src/setsu.c.o: setsu/CMakeFiles/setsu.dir/compiler_depend.ts
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir=/home/ales/git/chiaki/cmake/CMakeFiles --progress-num=$(CMAKE_PROGRESS_1) "Building C object setsu/CMakeFiles/setsu.dir/src/setsu.c.o"
	cd /home/ales/git/chiaki/cmake/setsu && /usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -MD -MT setsu/CMakeFiles/setsu.dir/src/setsu.c.o -MF CMakeFiles/setsu.dir/src/setsu.c.o.d -o CMakeFiles/setsu.dir/src/setsu.c.o -c /home/ales/git/chiaki/setsu/src/setsu.c

setsu/CMakeFiles/setsu.dir/src/setsu.c.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing C source to CMakeFiles/setsu.dir/src/setsu.c.i"
	cd /home/ales/git/chiaki/cmake/setsu && /usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -E /home/ales/git/chiaki/setsu/src/setsu.c > CMakeFiles/setsu.dir/src/setsu.c.i

setsu/CMakeFiles/setsu.dir/src/setsu.c.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling C source to assembly CMakeFiles/setsu.dir/src/setsu.c.s"
	cd /home/ales/git/chiaki/cmake/setsu && /usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -S /home/ales/git/chiaki/setsu/src/setsu.c -o CMakeFiles/setsu.dir/src/setsu.c.s

# Object files for target setsu
setsu_OBJECTS = \
"CMakeFiles/setsu.dir/src/setsu.c.o"

# External object files for target setsu
setsu_EXTERNAL_OBJECTS =

setsu/libsetsu.a: setsu/CMakeFiles/setsu.dir/src/setsu.c.o
setsu/libsetsu.a: setsu/CMakeFiles/setsu.dir/build.make
setsu/libsetsu.a: setsu/CMakeFiles/setsu.dir/link.txt
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --bold --progress-dir=/home/ales/git/chiaki/cmake/CMakeFiles --progress-num=$(CMAKE_PROGRESS_2) "Linking C static library libsetsu.a"
	cd /home/ales/git/chiaki/cmake/setsu && $(CMAKE_COMMAND) -P CMakeFiles/setsu.dir/cmake_clean_target.cmake
	cd /home/ales/git/chiaki/cmake/setsu && $(CMAKE_COMMAND) -E cmake_link_script CMakeFiles/setsu.dir/link.txt --verbose=$(VERBOSE)

# Rule to build all files generated by this target.
setsu/CMakeFiles/setsu.dir/build: setsu/libsetsu.a
.PHONY : setsu/CMakeFiles/setsu.dir/build

setsu/CMakeFiles/setsu.dir/clean:
	cd /home/ales/git/chiaki/cmake/setsu && $(CMAKE_COMMAND) -P CMakeFiles/setsu.dir/cmake_clean.cmake
.PHONY : setsu/CMakeFiles/setsu.dir/clean

setsu/CMakeFiles/setsu.dir/depend:
	cd /home/ales/git/chiaki/cmake && $(CMAKE_COMMAND) -E cmake_depends "Unix Makefiles" /home/ales/git/chiaki /home/ales/git/chiaki/setsu /home/ales/git/chiaki/cmake /home/ales/git/chiaki/cmake/setsu /home/ales/git/chiaki/cmake/setsu/CMakeFiles/setsu.dir/DependInfo.cmake --color=$(COLOR)
.PHONY : setsu/CMakeFiles/setsu.dir/depend

@echo off
echo.
echo Compiling Java files...

chcp 65001
title CalcX

REM Go to the folder where the batch file is located
cd /d "%~dp0"

REM Clean old compiled class files
if exist bin (
    del /s /q bin\*.class >nul 2>&1
) else (
    mkdir bin
)

REM Compile all Java files from src recursively into bin
javac -d bin -sourcepath src src\App.java

REM Check if compilation was successful
if %errorlevel% neq 0 (
    echo.
    echo Compilation failed!
    pause
    exit /b
)

echo.
echo Compilation successful!
echo Running program...

cls

REM Run the main class from bin
java -cp bin App

echo.
pause

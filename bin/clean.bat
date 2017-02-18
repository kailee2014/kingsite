@echo off
rem /**
rem  * Copyright &copy; 2012-2016 KingSite All rights reserved.
rem  *
rem  * Author: Blooms@163.com
rem  */
echo.
echo [信息] 清理生成路径。
echo.
pause
echo.

cd %~dp0
cd..

call mvn clean

cd bin
pause
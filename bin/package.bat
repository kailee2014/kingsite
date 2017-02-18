@echo off
rem /**
rem  * Copyright &copy; 2012-2016 KingSite All rights reserved.
rem  *
rem  * Author: Blooms@163.com
rem  */
echo.
echo [信息] 打包工程，生成war包文件。
echo.
pause
echo.

cd %~dp0
cd..

call mvn clean package -Dmaven.test.skip=true

cd bin
pause
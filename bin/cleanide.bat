@echo off
rem /**
rem  * Copyright &copy; 2012-2016 KingSite All rights reserved.
rem  *
rem  * Author: Blooms@163.com
rem  */
echo.
echo [信息] 清理Eclipse工程文件。
echo.
pause
echo.

cd %~dp0

cd..
call mvn -Declipse.workspace=%cd% eclipse:clean eclipse:eclipse

del .classpath
del .project

pause
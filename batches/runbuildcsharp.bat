cls
set options=doc srccsharp testcsharp
set runablefolder=../../vxlisp/dist
rem set runablefolder=../../vxlisp/src
set currentfolder=%cd%
set srcfolder=%currentfolder%/../src
set runable=vxlisp_win64.exe
rem set runable=go run .
set pipe=
rem set pipe=> %currentfolder%/run.log
cd %runablefolder%
%runable% %options% :path %srcfolder% %pipe%
cd %currentfolder%

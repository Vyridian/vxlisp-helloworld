cls
set options=doc srcjs testjs
set runablefolder=..\..\vxlisp-runtime
rem set runablefolder=..\..\vxlisp-compiler
set currentfolder=%cd%
set srcfolder=%currentfolder%\..\src
set runable=vxlisp_win64.exe
rem set runable=go run .
set pipe=
rem set pipe=> %currentfolder%\run.log
cd %runablefolder%
%runable% %options% :path %srcfolder% %pipe%
cd %currentfolder%

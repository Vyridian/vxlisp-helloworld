#!/bin/bash
options="doc srcswift testswift"
runablefolder=../../vxlisp/dist
# runablefolder=../../vxlisp/src
currentfolder=$PWD
srcfolder=%currentfolder%/../src
runable=vxlisp_linux64
# runable=vxlisp_mac64
# runable="go run ."
pipe=
# pipe=> %currentfolder%/run.log
cd $runablefolder
$runable $options :path $srcfolder $pipe
cd $currentfolder

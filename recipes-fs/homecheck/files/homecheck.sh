#!/bin/sh

SHDIR="/home/shared"

# Check shared data
if [ ! -d ${SHDIR} ]
then
    mkdir ${SHDIR}
fi

if [ ! -f /etc/exports ] && ! grep ${SHDIR} /etc/exports
then 
    echo "${SHDIR} *(rw,sync)" > /etc/exports
fi

for d in Music Photo Video
do
    if [ ! -d ${SHDIR}/${d} ]
    then
	mkdir ${SHDIR}/${d}
    fi
done

exit 0

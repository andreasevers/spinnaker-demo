#!/bin/sh
range=5
number=$((RANDOM % range))

while true
do
   http http://rickandmorty.apps.lropcf.pushto.cf | grep background
   echo "Sleeping 0.$number seconds"
   sleep 0.$number
   number=$((RANDOM % range))
done
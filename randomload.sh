#!/bin/sh
range=5
number=$((RANDOM % range))

while true
do
   http 34.76.13.187 | grep background
   echo "Sleeping 0.$number seconds"
   sleep 0.$number
   number=$((RANDOM % range))
done
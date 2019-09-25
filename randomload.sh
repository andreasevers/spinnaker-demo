#!/bin/sh
range=5
number=$((RANDOM % range))

while true
do
   http 35.245.16.174 | grep background
   echo "Sleeping 0.$number seconds"
   sleep 0.$number
   number=$((RANDOM % range))
done
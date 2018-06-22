#!/bin/sh
range=5
number=$((RANDOM % range))

while true
do
   http 35.233.120.240 | grep background
   echo "Sleeping 0.$number seconds"
   sleep 0.$number
   number=$((RANDOM % range))
done
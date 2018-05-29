#!/bin/sh
range=5
number=$((RANDOM % range))

while true
do
   http 35.233.120.240 | grep background
   echo "Sleeping $number seconds"
   sleep $number
   number=$((RANDOM % range))
done
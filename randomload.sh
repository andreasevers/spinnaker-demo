#!/bin/sh
range=5
number=$((RANDOM % range))

while true
do
   http rickandmorty.apps.sonoma.cf-app.com | grep background
   echo "Sleeping 0.$number seconds"
   sleep 0.$number
   number=$((RANDOM % range))
done
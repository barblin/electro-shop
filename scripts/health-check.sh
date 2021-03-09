#!/bin/bash
# Perform health check

resp=""
retries=30
while [[ ("$resp" != "200") && ( "$retries" > 0 ) ]]; do
	echo "$retries retries left. Testing for service availability..."
	sleep 6s
	retries=`expr $retries - 1`
	resp=$(curl -o /dev/null -s -w "%{http_code}\n" http://localhost:4000/api/processes/executions)
done

if (( "$retries" <= 0 )); then
	echo "Site not reachable. Setup aborted. Please refer to ./logs/startup.log for more information."
	exit 1
fi
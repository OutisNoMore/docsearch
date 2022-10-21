set -e
START_DIR=$1
find $START_DIR > find-results.txt
grep ".txt" find-results.txt > grep-results.txt
wc grep-results.txt

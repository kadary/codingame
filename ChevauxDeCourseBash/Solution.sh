# Auto-generated code below aims at helping you parse
# the standard input according to the problem statement.

read N
for (( i=0; i<N; i++ )); do
    read Pi
    power[$i]=$Pi
done
power=($(for each in ${power[@]}; do echo $each; done | sort -n))
#echo "${power[*]}" >&2

answer=10000000
for ((i=0; i<${#power[@]}-1; i++))
    do
        current=${power[$i]}
        next=${power[$i+1]}
        #echo "$current - $next" >&2
        D=$((next-current))
        if [ $D -lt $answer ]; then
            answer=$D
        fi
    done

echo "$answer"

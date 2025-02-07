function merge(left,right)
{
   let output=[]
    while(left.length && right.length)
    {
        if(left[0]<right[0])
        {
            output.push(left.shift());
        }
        else{
            output.push(right.shift())
        }
    }

    return output.concat(left,right)
}

function mergesort(arr)
{
    if(arr.length<2)
    {
        return arr
    }
    let mid=Math.floor(arr.length/2)
    let left=mergesort(arr.slice(0,mid))
    let right=mergesort(arr.slice(mid,arr.length))

    return merge(left,right)
}


let arr=[5,2,8,7,5,1,1,9]
console.log(mergesort(arr))
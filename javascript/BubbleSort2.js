var arr = [1,3,6,2,4,9];

for(var j = 0; j<arr.length-1; j++){
  for(var i = 0; i<arr.length-1-j; i++){
    if(arr[i]>arr[i+1]){
       var temp = arr[i];
       arr[i] = arr[i+1];
       arr[i+1] = temp;
   };
 };
};
alert(arr);
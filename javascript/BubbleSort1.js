var arr = [1,3,6,2,4,9];
var flag = true;
while(flag){
  flag = false;
  for(var i = 0; i<arr.length-1; i++){
    if(arr[i]>arr[i+1]){
       var temp = arr[i];
       arr[i] = arr[i+1];
       arr[i+1] = temp;
       flag = true;
   };
 };
};
alert(arr);
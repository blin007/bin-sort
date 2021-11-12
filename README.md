# bin-sort
A sorting scheme for integer values in a restricted number-range

Let's say that we want to sort an array arr: [2,0,3,6,7,8,1,2,9,9,3,1,4,7,3]:
  Each element is within the range 0 - 9

We create an array of bins Bins[0...9]:
  Each index i of Bin[i] holds a bin data structure with FIFO structure

We remove and append the elements from arr into the corresponding bin

Bins: [ 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 ]    <--- index

Arr1: | 0 | 1 | 2 | 3 | 4 | - | 6 | 7 | 8 | 9 |

Arr2: | - | 1 | 2 | 3 | - | - | - | 7 | - | 9 |

Arr3: | - | - | - | 3 | - | - | - | - | - | - |

Then iterate through bins and remove each element from each bin and append it to arr

sorted arr: [0,1,1,2,2,3,3,3,4,6,7,7,8,9,9]


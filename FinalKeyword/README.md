## Final Methods
### Description:
In this activity you will learn how and when to use final methods. You will use a Bank class and see why some methods should be final.
Please follow the steps below:

### Steps:
1. Make a Bank 2 class that extends bank and overrides withdraw. 
2. Create an object of Bank2. Now withdraw some money from this new Bank2 object. Then print out the amount variable from this new object.
3. See how the amount from the original bank has decreased because of the Bank2 object withdrawl. 
  - Explanation: Because the amount variable in the original bank is static, the Bank2 class' amount is using the same value. Any decrease to this value will be reflected in the original value. 
4. We do not want this to be the case. Make a change to the original Bank class to make it so that there can be no Bank2 or any other inherited class without deleting the file.
5. Then make a change to the method. 
6. Lets try and change our pin number. 
7. If everything is done correctly this program will not run. Please review the lesson for why. 
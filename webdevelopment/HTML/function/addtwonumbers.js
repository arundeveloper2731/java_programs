//add two numbers
let prompt = require("prompt-sync")();

let choice;

do
{
    console.log("1.Add Two Numbers \n2.check even or odd\n3.Multiply Two Numbers and check result\n4.exit");

    choice =Number(prompt("enter your choice: "));

    switch(choice)
    {
        case 1:
            let a=Number(prompt("enter first number: "));
            let b=Number(prompt("enter second number: "));

            const add=(x,y) => x+y;

            function displaySum(result)
            {
                console.log("Sum = ",result);
            }
            displaySum(add(a,b));
            break;

            case 2:
                let num=Number(prompt("enter a number: "));

                let check = function(n)
                {
                    if(n%2 === 0){
                        console.log(n +" is even");
                    }
                    else
                    {
                        console.log(n+" is odd");
                    }
                };

                check(num);
                break;

                case 3:
                    let n1=Number(prompt("enter first number : "));
                    let n2=Number(prompt("enter second number : "));

                    let multiply = (x,y) => x*y;

                    function checkResult(result,callback)
                    {
                        callback(result);
                    }

                    checkResult(multiply(n1,n2),function (res)
                {
                    if(res > 100){
                        console.log("Result = ",res,"- greater than 100");

                    }
                    else{
                        console.log("result = ",res,"-not greater than 100");
                    }
                });
                break;
                case 4:
                    console.log("thank you");
                    break;

                    default:
                        console.log("invalid choice");
    }




}while(choice != 4);

for (int i = 0; i < 20; i++)
{
    if ( i % 3 == 0)
    {
        system.out.println("Fizz");
    }
    else if ( i % 5 == 0)
    {
        system.out.println("Buzz");
    }
    else if (i % 3 == 0 && i % 5 == 0)
    {
        system.out.println("FizzBuzz");
    }
    else
    {
        system.out.println(i);
    }
}
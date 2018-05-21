package Chapter_16_a_01;

/*
        Write a method called countDuplicates that returns the number of duplicates in a sorted list. The list will be in
        sorted order, so all of the duplicates will be grouped together. For example, if a variable list stores the values
        [1, 1, 1, 3, 3, 6, 9, 15, 15, 23, 23, 23, 40, 40], the call of list.countDuplicates() should
        return 7 because there are 2 duplicates of 1, 1 duplicate of 3, 1 duplicate of 15, 2 duplicates of 23, and 1 duplicate of 40.
*/
public class Exercise_05_a
{
    public static void main(String[] args)
    {
        LinkedIntList list = new LinkedIntList();

        list.add(2);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(6);
        list.add(9);
        list.add(15);
        list.add(15);
        list.add(13);
        list.add(23);
        list.add(23);
        list.add(41);
        list.add(41);

        countDuplicates(list);

    }

    public static void countDuplicates (LinkedIntList list)
    {
        LinkedIntList compareList = new LinkedIntList();
        int a = 0;
        int b = 0;

        while (list.size() > compareList.size())
        {
            if (compareList.contains(list.get(b)))
            {
                compareList.add(list.get(b));
                a++;
            }
                else
                {
                compareList.add(list.get(b));
                }
            b++;
        }
        System.out.println(a);
    }

}

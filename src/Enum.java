enum Status {
    Running, Failed, Pending, Success;
}

public class Enum {
    public static void main(String[] args) {
        // enum is a special data type used to define a collection of constants.
        // It is a class type that represents a fixed set of known values.
        Status status = Status.Running;
        System.out.println(status);
        System.out.println(status.ordinal());
        // ordinal() ->reffer to the index if we type Status.success it willreturn 3.
        Status[] status1 = Status.values();
        System.out.println(status1[2]);

        for (Status status2 : status1) {
            System.out.println(status2 + " : " + status2.ordinal());

        }

        Status status3 = Status.Failed;
        if (status3 == status3.Running)
            System.out.println("All Good");
        else if (status3 == status3.Failed)
            System.out.println("Try Again");
        else if (status3 == status3.Pending)
            System.out.println("Please Wait");
        else if (status3 == status3.Success)
            System.out.println("Done");

        Status status4 = Status.Pending;
        switch (status4) {
            case Running:
                System.out.println("All Good");
                break;
            case Failed:
                System.out.println("Try Again");
                break;
            case Pending:
                System.out.println("Please Wait");
                break;
            default:
                System.out.println("Done");

                break;
        }

    }
}

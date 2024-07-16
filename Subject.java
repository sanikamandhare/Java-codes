
class SCloops {
    private String subID;
    private String name;
    private int maxMarks;
    private int marksObtain;

    public String getsubIDString()
    {
        return subID;
    }
    public String getname()
    {
        return name;
    }
    public int getmaxMarks()
    {
        return maxMarks;
    }
    public int getmarksObtain()
    {
        return marksObtain;
    }

    public SCloops(String subID,String name,int maxMarks)
    {
        this.subID=subID;
        this.name=name;
        this.maxMarks=maxMarks;
    }

    public void setmaxMarks(int mm)
    {
        maxMarks=mm;
    }
    public void setmarksObtain(int mo)
    {
        marksObtain=mo;
    }

    boolean isQualified()
    {
        return marksObtain>=maxMarks/10*4;
    }
    public String toString()
    {
        return "\n Subject ID: "+subID+"\n name: "+name+"\n Maximum marks:"+maxMarks;
    }
}

public class Subject
{
    public static void main(String[] args) {
        SCloops subs[]=new SCloops[3];
        subs[0]=new SCloops("s101","DS",100);
        subs[1]=new SCloops("s102","Algo",110);
        subs[2]=new SCloops("s101","Data science",120);

        for(SCloops s:subs)
            System.out.println(s);
        
    }
}

package msku.ceng.madlab.week100;

import com.google.firebase.database.Exclude;

public class Note {

    @Exclude // bunu veri tabanına yazma diyoruz
    private String id;
    private Timestamp date;
    private String content;

}

package com.hkjc.racingtouch.model;

import com.hkjc.racingtouch.model.Meeting;
import java.util.ArrayList;
import java.util.List;

public class HrProfileHorse {
    private int id;
    private String md5;
    private List<Meeting> meetings;
    private String name;
    private String timestamp;
    private String version;

    public String getName() {
        return this.name;
    }

    public void setName(String str) {
        this.name = str;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int i) {
        this.id = i;
    }

    public String getVersion() {
        return this.version;
    }

    public void setVersion(String str) {
        this.version = str;
    }

    public String getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(String str) {
        this.timestamp = str;
    }

    public String getMd5() {
        return this.md5;
    }

    public void setMd5(String str) {
        this.md5 = str;
    }

    public List<Meeting> getMeetings() {
        return this.meetings;
    }

    public void setMeetings(List<Meeting> list) {
        this.meetings = list;
    }

    public void addMeeting(Meeting meeting) {
        if (this.meetings == null) {
            this.meetings = new ArrayList();
        }
        this.meetings.add(meeting);
    }
}

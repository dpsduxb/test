package com.hkjc.racingtouch.model;

import com.hkjc.racingtouch.utils.HKJCHelper;

public class Winner {
    private String finalSectionalTime;
    private String finishTime;
    private String nameC;
    private String nameE;
    private int placing;

    private String getNameC() {
        return HKJCHelper.emptyIfEqualsFlag(null, this.nameC);
    }

    public void setNameC(String str) {
        this.nameC = str;
    }

    private String getNameE() {
        return HKJCHelper.emptyIfEqualsFlag(null, this.nameE);
    }

    public void setNameE(String str) {
        this.nameE = str;
    }

    public String getName() {
        return HKJCHelper.getStringByLanguage(this.nameC, this.nameE);
    }

    public String getFinishTime() {
        return HKJCHelper.emptyIfEqualsFlag(null, this.finishTime);
    }

    public void setFinishTime(String str) {
        this.finishTime = str;
    }

    public int getPlacing() {
        return this.placing;
    }

    public void setPlacing(int i) {
        this.placing = i;
    }

    public String getFinalSectionalTime() {
        return HKJCHelper.emptyIfEqualsFlag(null, this.finalSectionalTime);
    }

    public void setFinalSectionalTime(String str) {
        this.finalSectionalTime = str;
    }
}

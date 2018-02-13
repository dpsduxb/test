package com.hkjc.racingtouch.model;

import com.hkjc.racingtouch.constants.OddsChangeState;
import com.hkjc.racingtouch.utils.HKJCHelper;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class OddsInfo implements Serializable {
    private static final long serialVersionUID = -715541101000475932L;
    private int hot;
    private String name;
    private String number;
    private String odds;
    private String oddsDrop;
    private int oddsRange;
    private int scratched;
    private List<Starter> starters;
    private int widgetId;

    public boolean isScratched() {
        return this.scratched == 1;
    }

    public void setScratched(int i) {
        this.scratched = i;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String str) {
        this.name = str;
    }

    public String getNumber() {
        return HKJCHelper.emptyIfEqualsFlag(null, this.number);
    }

    public void setNumber(String str) {
        this.number = str;
    }

    public int getOddsRange() {
        return this.oddsRange;
    }

    public void setOddsRange(int i) {
        this.oddsRange = i;
    }

    public boolean isHot() {
        return this.hot == 1;
    }

    public void setHot(int i) {
        this.hot = i;
    }

    public String getOddsDrop() {
        return HKJCHelper.emptyIfEqualsFlag(null, this.oddsDrop);
    }

    public void setOddsDrop(String str) {
        this.oddsDrop = str;
    }

    public String getOdds() {
        return HKJCHelper.emptyIfEqualsFlag(null, this.odds);
    }

    public void setOdds(String str) {
        this.odds = str;
    }

    public List<Starter> getStarters() {
        return this.starters;
    }

    public void setStarters(List<Starter> list) {
        this.starters = list;
    }

    public void addStarter(Starter starter) {
        if (this.starters == null) {
            this.starters = new ArrayList();
        }
        this.starters.add(starter);
    }

    public int getWidgetId() {
        return this.widgetId;
    }

    public void setWidgetId(int i) {
        this.widgetId = i;
    }

    public OddsChangeState getOddsChangeState() {
        double doubleValue;
        try {
            doubleValue = Double.valueOf(this.oddsDrop.replaceAll(",", "")).doubleValue();
        } catch (Exception e) {
            doubleValue = 0.0d;
        }
        return OddsChangeState.getByOddsDrop(isScratched(), isHot(), doubleValue);
    }

    public String toString() {
        return "OddsInfo [scratched=" + this.scratched + ", oddsRange=" + this.oddsRange + ", hot=" + this.hot + ", number=" + this.number + ", oddsDrop=" + this.oddsDrop + ", odds=" + this.odds + "]";
    }
}

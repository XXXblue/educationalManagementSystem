package poView;

import po.Courseinfo;

/**
 * @Author: XBlue
 * @Date: Create in 2017/9/1817:14
 * @Description:
 * @Modified By:
 */
public class CourseInfoView extends Courseinfo {
    private String scourseDay;
    private String scourseDayTime;
    private Integer week;
    private Integer page;
    private Integer limit;

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getWeek() {
        return week;
    }

    public void setWeek(Integer week) {
        this.week = week;
    }
    public String getScourseDay() {
        return scourseDay;
    }

    public void setScourseDay(String scourseDay) {
        this.scourseDay = scourseDay;
    }

    public String getScourseDayTime() {
        return scourseDayTime;
    }

    public void setScourseDayTime(String scourseDayTime) {
        this.scourseDayTime = scourseDayTime;
    }
}

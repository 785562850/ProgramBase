package DesignPattern.InterceptingFilterPattern;

import javafx.collections.transformation.FilteredList;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by john on 2017/10/4.
 */
public class FilterChain {
    private List<Filter> filterList;
    private Target target;
    public FilterChain(){

    }
    public void addFilter(Filter filter){
        filterList=new ArrayList<Filter>();
        filterList.add(filter);
    }
    public Target getTarget() {
        return target;
    }

    public void setTarget(Target target) {
        this.target = target;
    }
    public void execute(String request){
        for (Filter filter:filterList) {
            filter.execute(request);
        }
        target.execute(request);
    }
}

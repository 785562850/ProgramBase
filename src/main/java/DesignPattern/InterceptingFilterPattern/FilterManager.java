package DesignPattern.InterceptingFilterPattern;

/**
 * Created by john on 2017/10/4.
 */
public class FilterManager {
    private FilterChain filterChain;

    public FilterManager(Target target) {
        this.filterChain = new FilterChain();
        filterChain.setTarget(target);
    }
    public void setFilter(Filter filter){
        filterChain.addFilter(filter);
    }
    public void filterRequest(String request){
        filterChain.execute(request);
    }
}

/**
 * 
 */
package yuanjun.chen.design.state;

/**
 * @author hp
 *
 */
public class Context {
    protected State state;

    public Context(State state) {
        super();
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void request() {
        state.handle(this);
    }

}

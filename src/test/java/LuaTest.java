import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaValue;
import org.luaj.vm2.lib.jse.JsePlatform;

public class LuaTest {
    public static void main(String[] args) {
        Globals _G = JsePlatform.standardGlobals();

        String luaScript = "function print(msg) return msg end";
        LuaValue chunk = _G.load(luaScript);

        chunk.call();

        LuaValue greet = _G.get("print");
        LuaValue result = greet.call(LuaValue.valueOf("Lua test"));

        System.out.println(result.toString());
    }
}

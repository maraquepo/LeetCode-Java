package JPMorgan;

public class reachingPoints {
    public boolean reachingPoints(int sx, int sy, int tx, int ty) {
        // while target x,y are greater than or equal to the source x,y

        // if tx is greater than sy
        // if source y and target y are equal
        // return true if (target x 0 source x) modulus source y is equal to 0
        // if source y and target y aren't equal, target x will be assigned to target x modulus target y
        // this will subtract target x by target y, until there's a remainder

        // repeat for y

        while (tx >= sx && ty >= sy) {
            if (tx > ty) {
                if (sy == ty) {
                    return (tx - sx) % sy == 0;
                }
                tx %= ty;
            } else {
                if (sx == tx) {
                    return (ty - sx) % sx == 0;
                }
            }
        }
        return false;
    }
}

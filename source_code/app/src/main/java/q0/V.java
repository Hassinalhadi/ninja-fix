package q0;

/* loaded from: classes3.dex */
public final class V implements U {
    public final String bravo;
    public final C2399r charlie;
    public final C2399r delta;

    public V(String str) {
        this.bravo = str;
        this.charlie = new C2399r(str);
        this.delta = new C2399r(str.concat(" maximum"));
    }

    public final String toString() {
        return this.bravo;
    }
}

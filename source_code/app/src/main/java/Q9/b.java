package Q9;

import android.location.Location;
import com.app.feature.location.api.LocationPayloadMapper;

/* loaded from: classes2.dex */
public final /* synthetic */ class b implements LocationPayloadMapper {
    @Override // com.app.feature.location.api.LocationPayloadMapper
    public final String toPayload(Location location) {
        String echo;
        echo = c.echo(location);
        return echo;
    }
}

package com.incognia.internal;

import android.net.IpPrefix;
import android.net.LinkAddress;
import android.net.LinkProperties;
import android.net.ProxyInfo;
import android.net.RouteInfo;
import android.net.Uri;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.ArraysKt;

/* loaded from: classes2.dex */
public final class E {
    public final G4 b(LinkProperties linkProperties) {
        String str;
        Boolean bool;
        Integer num;
        Inet4Address inet4Address;
        InetAddress inetAddress;
        Boolean bool2;
        String str2;
        s1p s1pVar;
        String str3;
        String str4;
        List list;
        String str5;
        IpPrefix nat64Prefix;
        boolean isWakeOnLanSupported;
        int mtu;
        String privateDnsServerName;
        boolean isPrivateDnsActive;
        CnH cnH = CnH.f8484b;
        if (CnH.b(cnH, 28, 0, 2)) {
            privateDnsServerName = linkProperties.getPrivateDnsServerName();
            isPrivateDnsActive = linkProperties.isPrivateDnsActive();
            str = privateDnsServerName;
            bool = Boolean.valueOf(isPrivateDnsActive);
        } else {
            str = null;
            bool = null;
        }
        if (CnH.b(cnH, 29, 0, 2)) {
            mtu = linkProperties.getMtu();
            num = Integer.valueOf(mtu);
        } else {
            num = null;
        }
        if (CnH.b(cnH, 30, 0, 2)) {
            inet4Address = linkProperties.getDhcpServerAddress();
            nat64Prefix = linkProperties.getNat64Prefix();
            if (nat64Prefix != null) {
                inetAddress = nat64Prefix.getAddress();
            } else {
                inetAddress = null;
            }
            isWakeOnLanSupported = linkProperties.isWakeOnLanSupported();
            bool2 = Boolean.valueOf(isWakeOnLanSupported);
        } else {
            inet4Address = null;
            inetAddress = null;
            bool2 = null;
        }
        if (inet4Address != null) {
            str2 = inet4Address.getHostAddress();
        } else {
            str2 = null;
        }
        List<InetAddress> dnsServers = linkProperties.getDnsServers();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = dnsServers.iterator();
        while (it.hasNext()) {
            String hostAddress = ((InetAddress) it.next()).getHostAddress();
            if (hostAddress != null) {
                arrayList.add(hostAddress);
            }
        }
        String domains = linkProperties.getDomains();
        ProxyInfo httpProxy = linkProperties.getHttpProxy();
        if (httpProxy != null) {
            String[] exclusionList = httpProxy.getExclusionList();
            if (exclusionList != null) {
                list = ArraysKt.b(exclusionList);
            } else {
                list = null;
            }
            String host = httpProxy.getHost();
            Uri pacFileUrl = httpProxy.getPacFileUrl();
            if (pacFileUrl != null) {
                str5 = pacFileUrl.getHost();
            } else {
                str5 = null;
            }
            s1pVar = new s1p(list, host, str5, Integer.valueOf(httpProxy.getPort()));
        } else {
            s1pVar = null;
        }
        String interfaceName = linkProperties.getInterfaceName();
        List<LinkAddress> linkAddresses = linkProperties.getLinkAddresses();
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it2 = linkAddresses.iterator();
        while (it2.hasNext()) {
            String hostAddress2 = ((LinkAddress) it2.next()).getAddress().getHostAddress();
            if (hostAddress2 != null) {
                arrayList2.add(hostAddress2);
            }
        }
        if (inetAddress != null) {
            str3 = inetAddress.getHostAddress();
        } else {
            str3 = null;
        }
        List<RouteInfo> routes = linkProperties.getRoutes();
        ArrayList arrayList3 = new ArrayList();
        for (RouteInfo routeInfo : routes) {
            String hostAddress3 = routeInfo.getDestination().getAddress().getHostAddress();
            InetAddress gateway = routeInfo.getGateway();
            if (gateway != null) {
                str4 = gateway.getHostAddress();
            } else {
                str4 = null;
            }
            arrayList3.add(new NF3(hostAddress3, str4, routeInfo.getInterface()));
        }
        return new G4(str2, arrayList, domains, s1pVar, interfaceName, arrayList2, num, str3, str, arrayList3, bool, bool2);
    }
}

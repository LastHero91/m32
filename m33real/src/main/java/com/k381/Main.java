package com.k381;

import javax.management.MBeanServer;
import javax.management.ObjectName;
import java.lang.management.ManagementFactory;

public class Main {


    public static void main(String[] args) throws Exception {
        SumServer server = new SumServer();

        MBeanServer mBeanServer = ManagementFactory.getPlatformMBeanServer();
        ObjectName objectName = new ObjectName("com.k381:type=SumServer");

        mBeanServer.registerMBean(server, objectName);

        server.run();
    }
}

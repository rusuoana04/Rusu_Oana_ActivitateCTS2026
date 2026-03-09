package cts.rusu.oana.as.main;

import cts.rusu.oana.as.pattern.Builder.HolidayPackage;
import cts.rusu.oana.as.pattern.Builder.HolidayPackageBuilder;
import cts.rusu.oana.as.pattern.Singleton.AbstractTurismLicence;
import cts.rusu.oana.as.pattern.Singleton.LicentaTurism;

public class Main {
    public static void main(String[] args) throws Exception {

//
//       AbstractTurismLicence licence= LicentaTurism.getInstance();
//       AbstractTurismLicence licena1= LicentaTurism.getInstance();
//
//       licence.setLicenceNumber(100);
//       System.out.println(licence);
//        System.out.println(licena1);
//
//        System.out.println(licena1==licence);
//
//        licence.setLicenceNumber(200);

        HolidayPackage pachet1= new HolidayPackageBuilder(3).setCameraSingle(true).setTransportAvion(true).setCinciStele(true).build();
        System.out.println(pachet1);

    }
}
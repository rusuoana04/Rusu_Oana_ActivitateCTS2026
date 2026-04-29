public class Facade {

    public void verificaCamera(int codCamera)
    {
        Camera cameraLibera=new Camera(codCamera);
        CameraCurata cameraCurata=new CameraCurata(codCamera);
        CameraProsop cameraProsop=new CameraProsop(codCamera);

        System.out.println( cameraLibera.verificaCameraLibera());
        System.out.println(cameraProsop.verificaProsop());
        System.out.println(cameraCurata.cameraCurata());


        if(cameraCurata.cameraCurata()&& cameraLibera.verificaCameraLibera()&& cameraLibera.verificaCameraLibera()==true)
        {
            System.out.println("Camera pregatita pentru a fi rezervata");
        }
        else
        {
            System.out.println("Camera nu este pregatita");
        }



    }
}

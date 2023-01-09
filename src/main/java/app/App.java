package app;

import service.DenemeService;

/**
 * @author hcalpay
 * @Date 25.12.2022
 */
public class App {

    public static void main(String[] args) {

        DenemeService service = new DenemeService();
        service.ekle();

        service.sil();

    }
}

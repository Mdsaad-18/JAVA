public class Camera {

        public static boolean flash(){
                boolean flash_light = true;
                if (flash_light){
                        System.out.println("Flash Light is ON");
                        
                }else{
                        System.out.println("Flash Light is OFF");
                        
                }
                System.out.println("Method is End");

                int obj_distance = 100;
                if (obj_distance > 100){
                        System.out.println("Object is Not Clear");
                        
                }else{
                        System.out.println("Object is Clear");
                        
                }
                System.out.println("Method is End");
                return true;
        }
        public static boolean lens(){
                boolean lens_equiped = true;
                if (lens_equiped){
                        System.out.println("Lens is Equiped");
                        
                }else{
                        System.out.println("Lens is Not Equiped");
                        
                }
                System.out.println("Method is End");
                
                int lens_size =200;
                if (lens_size>100){
                        System.out.println("Image quality is High");
                        
                }else{
                        System.out.println("Image Quality is low");
                        
                }
                System.out.println("Method is End");
                return true;
        }
        public static boolean video(){
                boolean video_support = true;
                if (video_support){
                        System.out.println("Camera support video recording");
                        
                }else{
                        System.out.println("Camera not support video recording");
                        
                }
                System.out.println("Method is End");
                
                int video_quality =1080;
                if (video_quality>=1080){
                        System.out.println("Video Quality is Good");
                        
                }else{
                        System.out.println("Video Quality is Not Good");
                        
                }
                System.out.println("Method is End");
                return true;
        }
        public static boolean cam(){
                boolean auto_bright = true;
                if (auto_bright){
                        System.out.println("Camera automatically adjust Brightness");
                        
                }else{
                        System.out.println("Camera not adjust Brightness");
                        
                }
                System.out.println("Method is End");
                
                int cam_resolution = 1080;
                if (cam_resolution >= 1080){
                        System.out.println("Quality is high");
                        
                }else{
                        System.out.println("Quality is Low");
                        
                }
                System.out.println("Method is End");
                return true;
        }
        public static boolean modes(){
                boolean modes_ = true;
                if (modes_){
                        System.out.println("We can change camera mode");
                        
                }else{
                        System.out.println("We can't change camera mode");
                        
                }
                System.out.println("Method is End");
                
                int no_of_modes =10;
                if (no_of_modes==10){
                        System.out.println("No of modes is 10");
                        
                }else{
                        System.out.println("No modes option");
                        
                }
                System.out.println("Method is End");
                return true;
        }
        public static boolean screen(){
                boolean cam_screen = true;
                if (cam_screen){
                        System.out.println("Camera have Display");
                        
                }else{
                        System.out.println("Camera Dont have Display");
                        
                }
                System.out.println("Method is End");
                
                double display_size =3.5;
                if (display_size>2){
                        System.out.println("Good Display Quality");
                        
                }else{
                        System.out.println("Display is Small");
                        
                }
                System.out.println("Method is End");
                return true;
        }
        public static boolean photo(){
                boolean photos = true;
                if (photos){
                        System.out.println("Photos are very Good");
                        
                }else{
                        System.out.println("Photos are very bad");
                        
                }
                System.out.println("Method is End");
                
                int no_of_photos =100;
                if (no_of_photos>1000){
                        System.out.println("Memory is Full");
                        
                }else{
                        System.out.println("Memory is Free");
                        
                }
                System.out.println("Method is End");
                return true;
        }
        public static boolean memory(){
                boolean memory_card = true;
                if (memory_card){
                        System.out.println("Supports Memory card");
                        
                }else{
                        System.out.println("Not supports memory card");
                        
                }
                System.out.println("Method is End");
                
                int card =256;
                if (card>256){
                        System.out.println("Memory Card is Incompatible");
                        
                }else{
                        System.out.println("Memory Card is Compatible");
                        
                }
                System.out.println("Method is End");
                return true;
        }
        public static boolean battery(){
                boolean batteries = true;
                if (batteries){
                        System.out.println("Batteries are fully charged");
                        
                }else{
                        System.out.println("Batteries are drained");
                        
                }
                System.out.println("Method is End");
                
                int batteries_cost =200;
                if (batteries_cost==200){
                        System.out.println("Batteries Cost :200");
                        
                }else{
                        System.out.println("No Batteries");
                        
                }
                System.out.println("Method is End");
                return true;
        }
}
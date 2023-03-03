package com.example.btapbuoi6;
import java.util.ArrayList;

public class ImageData {
    public static ArrayList<Image> generateImageData(){

        ArrayList<Image> images = new ArrayList<>();

        images.add(new Image(0,"https://autopro8.mediacdn.vn/2022/2/17/2022-porsche-macan-t-16450961955491473978678.jpg","Porsche Macan T", " Porsche Macan T kết hợp khả năng vận hành ấn tượng hơn của phiên bản S với độ tiện nghi, thực tiễn và giá trị tốt của phiên bản thường để tạo nên một bộ khung thú vị hơn mà không quá đắt đỏ cho người dùng."));
        images.add(new Image(1, "https://images.autofun.vn/file1/781fbd93018a418e9bc1093377cb2421_1200.jpg","Porsche 911 Carrera T","Porsche 911 Carrera T là viết tắt của từ ‘Touring’, mô tả những dòng xe đua đường trường đề cao trải nghiệm lái, tương tự như trên phiên bản 911 T đầu tiên trong lịch sử được ra mắt vào năm 1968. Mẫu 911 T đầu tiên này được cung cấp tới năm 1973, vào năm 2017, Porsche đã hồi sinh phiên bản 911 Carrera T với thế hệ 991."));
        images.add(new Image(2, "https://icdn.24h.com.vn/upload/2-2022/images/2022-06-17/image4-1655433140-163-width600height337.jpg","Porsche Taycan","Porsche Taycan là dòng xe Sedan chạy điện đầu tiên của Porsche, cạnh tranh trực tiếp với dòng xe điện Tesla nổi tiếng của Mỹ."));
        images.add(new Image(3, "https://icdn.24h.com.vn/upload/2-2022/images/2022-06-17/image3-1655433140-374-width600height373.jpg","Porsche Panamera","Thế hệ mới nhất của dòng xe đã được đánh giá rất cao bởi thiết kế hiện đại, tinh tế, nhưng vẫn đậm chất thể thao, không làm mất đi giá trị cốt lõi mà Porsche vốn có."));
        images.add(new Image(4, "https://icdn.24h.com.vn/upload/2-2022/images/2022-06-17/image6-1655433140-270-width600height364.jpg","Porsche Cayenne","Porsche Cayenne thế hệ mới nhất mang thiết kế mới hầm hố và mạnh mẽ, với phần đầu xe dày dặn, chắc chắn, lưới tản nhiệt là những dải kim loại mạ Crom chạy ngang ôm hết phần đầu xe để tối ưu hóa khả năng làm mát."));
        images.add(new Image(5, "https://icdn.24h.com.vn/upload/2-2022/images/2022-06-17/image2-1655433140-478-width600height366.jpg","Porsche 718","Dòng xe Porsche 718 là tập hợp những mẫu xe hơi thể thao, trẻ trung của Porsche. Trong dòng xe 718 Series này nổi bật nhất là hai phiên bản 718 Boxster và 718 Cayman."));
        images.add(new Image(6,"https://porsche-vietnam.vn/wp-content/uploads/2018/11/modelseries-911carrera992-outdoor-07.jpg", "911 Carrera S","Để mang đến những trải nghiệm êm ái hơn cho người dùng, 911 Carrera 2020 đã được trang bị hệ thống treo chủ động của Porsche (PASM). PASM là một hệ thống điều khiển giảm xóc điện tử, chủ động và liên tục điều chỉnh lực giảm xóc trên mỗi bánh xe, dựa trên điều kiện đường hiện tại và phong cách lái xe - để giảm tác động lên cơ thể và do đó cải thiện sự thoải mái và tăng tính năng động."));
        return images;
    }

    public static Image getImageFromId(int id){
        ArrayList<Image> img = generateImageData();
        for(int i = 0; i < img.size(); i++){
            if (img.get(i).getId() == id)
                return img.get(i);
        }
        return null;
    }
}

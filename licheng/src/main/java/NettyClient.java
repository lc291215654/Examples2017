import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.codec.string.StringEncoder;

/**
 * Created by LICHENG on 2017/11/19.
 */
public class NettyClient {
    public static void main(String args[]) throws InterruptedException {
        Bootstrap client = new Bootstrap();
//  绑定线程组，处理读写和连接事件
        EventLoopGroup group = new NioEventLoopGroup();
        client.group(group);

        client.channel(NioSocketChannel.class);

        client.handler(new ChannelInitializer<NioSocketChannel>() {
            @Override
            protected void initChannel(NioSocketChannel ch) throws Exception {
                ch.pipeline().addLast(new SimpleClientHandler());
                ch.pipeline().addLast(new StringEncoder());
            }
        });

        ChannelFuture future = client.connect("localhost", 8083).sync();

        String msg = "hello nettyfasfsafsad";
        future.channel().writeAndFlush(msg);

        future.channel().closeFuture().sync();
        System.out.println("client over!");


    }


}

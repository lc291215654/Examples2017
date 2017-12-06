import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;

/**
 * Created by LICHENG on 2017/11/19.
 */
public class NettyServer {

    public static void main(String args[]) throws InterruptedException {
        ServerBootstrap server = new ServerBootstrap();
//        1、绑定两个线程组分别用来处理客户端通道的accept和读写事件
//        2、绑定服务端通道NioServerSocketChannel
//        3、给读写事件的线程通道绑定handler去真正处理读写
//        4、监听端口

        EventLoopGroup parentGroup = new NioEventLoopGroup();
        EventLoopGroup childGroup = new NioEventLoopGroup();

        server.group(parentGroup,childGroup);
        server.channel(NioServerSocketChannel.class);

        server.childHandler(new ChannelInitializer<SocketChannel>() {
            @Override
            protected void initChannel(SocketChannel ch) throws Exception {
                ch.pipeline().addLast(new SimpleServerHandler());
            }
        });

        ChannelFuture future = server.bind(8083).sync();
        future.channel().closeFuture().sync();




    }
}

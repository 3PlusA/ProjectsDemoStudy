// ��������
module.exports = {
    devServer: {                //��ס����д����devServer//���ñ���Ĭ�϶˿�  ѡ��
        port: 9876,
        proxy: {                 //���ô���������
            '/api': {              //����������  ��������ʽ   б��+���������֣����ֿ����Լ���
                target: 'http://localhost:9090',     //�����Ŀ���ַ
                changeOrigin: true,              //�Ƿ�����ͬԴ�������ǵ�
                pathRewrite: {                   //·����д
                    '^/api': ''                     //ѡ��������������������
                }
            }
        }
    }
}

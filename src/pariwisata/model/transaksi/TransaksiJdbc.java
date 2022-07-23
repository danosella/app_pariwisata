package pariwisata.model.transaksi;

import java.util.List;

/**
 *
 * @author Khanza
 */
public interface TransaksiJdbc {

    public List<Transaksi> selectAll();

    public void insert(Transaksi request);

    public void update(Transaksi request);
    
    public void delete(Long request);

}

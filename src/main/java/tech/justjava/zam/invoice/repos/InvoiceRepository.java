package tech.justjava.zam.invoice.repos;

import tech.justjava.zam.invoice.domain.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface InvoiceRepository extends JpaRepository<Invoice, Long> {
    List<Invoice> findByMerchantIdOrderByDueDateDesc(String merchantId);

    //Invoice findFirstByCusomer(Customer customer);

}
